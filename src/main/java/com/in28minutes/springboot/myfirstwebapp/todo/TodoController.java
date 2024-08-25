package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {

	private TodoService todoService;
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoService.findTodoByUsername("in28minutes");
		model.addAttribute("todos", todos);
		return "listTodos";
	}
	
	@RequestMapping(value ="add-todo", method = RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		String username = (String) model.get("name");
		Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "addTodo";
	}
	
	//NOTA: NEL REQUEST MAPPING STO INSERENDO L'URL E NON LA PAGINA JSP. IN UN' HREF DI UNA PAGINA VA INSERITO L'URL E NON IL NOME 
	// DELLA PAGINA JSP
	
	// QUANDO METTO IL REDIRECT, LO DEVO REINDIRIZZARE AD UN URL E NON ALLA PAGINA JSP
	
	// IN ADDNEWTODO HO TOLTO IL REQUESTPARAM E HO AGGIUNTO IL BINDING VERSO IL BEAN TODO. QUESTIONI DI SICUREZZA CONTRO HACKER
	
	// IL VALID SERVE PER ATTIVARE LA VALIDAZIONE DEL BEAN (size(min=10)) E IL BINDINGRESULT INSIEME AL <FORM:ERRORS DELLA PAGINA JSP
		//SERVONO A VISUALIZZARE IL MESSAGGIO DI ERRORE
	
	@RequestMapping(value ="add-todo", method = RequestMethod.POST)
	public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		if (result.hasErrors()) {
			return "addTodo";
		}
		String username = (String) model.get("name");
		todoService.addTodo(username, todo.getDescription(), LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}
	
	@RequestMapping("todo-delete")
	public String deleteTodo(@RequestParam int id) {
		todoService.deleteById(id);
		return "redirect:list-todos";
	}
}















