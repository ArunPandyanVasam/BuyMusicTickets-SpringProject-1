package ca.sheridancollege.vasam.ticket;


import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Data

public class Ticket {
	private String name;
	private String gender;
	private int age;
	private String date;
	private int noOfTickets;
	private double totalPrice;
	
	private String[] genders= {"Female", "Male"};
}
