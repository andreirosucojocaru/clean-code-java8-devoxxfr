package victor.clean.lambdas;

import static java.util.Optional.empty;
import static java.util.Optional.of;
import static java.util.Optional.ofNullable;

import java.util.Optional;

import lombok.Data;

// Sir Charles Antony Richard: "I call it my billion-dollar mistake. 
// It was the invention of the null reference in 1965..." 


class DiscountService {
	public String getDiscountLine(Customer customer) {
		return "Discount: " + getApplicableDiscountPercentage(customer.getMemberCard());
	}
		
	private Integer getApplicableDiscountPercentage(MemberCard card) { 
		if (card.getFidelityPoints() >= 100) {
			return 5;
		}
		if (card.getFidelityPoints() >= 50) {
			return 3;
		}
		return null;
	}
		
	// test: 60, 10, no MemberCard
	main
}



// VVVVVVVVV ==== supporting (dummy) code ==== VVVVVVVVV
class Customer {
	private MemberCard memberCard;
	public Customer() {
	}
	public Customer(MemberCard profile) {
		this.memberCard = profile;
	}
	public MemberCard getMemberCard() {
		return memberCard;
	}
}

@Data
class MemberCard {
	private final int fidelityPoints;
}
