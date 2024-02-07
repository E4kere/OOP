package problem2;

public class Contact {	
private String number;
private String email;

public Contact(String number, String email) {
    this.number = number;
	this.email = email;
}

@Override
public boolean equals(Object o) {
    if (this == o) 
    return true;
    if (o == null || getClass() != o.getClass()) 
    return false;

    Contact a = (Contact) o;

    return number.equals(a.number) && email.equals(a.email);
}

@Override
public int hashCode() {
    return 31 * (number.hashCode() + email.hashCode());
}

@Override
public String toString() {
    return "ContactForm [email=" + email + ", number=" + number + "]";
}

}
