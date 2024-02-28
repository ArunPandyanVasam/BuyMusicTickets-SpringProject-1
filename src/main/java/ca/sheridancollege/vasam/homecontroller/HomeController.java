package ca.sheridancollege.vasam.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.vasam.ticket.Ticket;
import ca.sheridancollege.vasam.ticketsdatabase.TicketsDatabase;



	@Controller
	public class HomeController {
		
		@GetMapping("/")
		public String goToRootPage() {
		return "rootPage.html";
		}
		
		@GetMapping("/addPage")
		public String goToAddPage(Model model) {
			model.addAttribute("ticket", new Ticket());
		return "addPage.html"; 
		}
		
		@PostMapping("/addPage")
		public String processAdd(Model model, @ModelAttribute Ticket ticket) {
			TicketsDatabase.tickets.add(ticket);
		return "redirect:/addPage";
		}
		
		@GetMapping("/viewPage")
		public String viewGames(Model model) {
			model.addAttribute("woof", TicketsDatabase.tickets);
		return "viewPage.html";
		}
}
