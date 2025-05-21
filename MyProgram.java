class AddressBook{
    private String firstName;
    private String lastName;
    private int streetAddress;
    private String city;
    private String state;
    private int zipCode;
    
    public AddressBook(String firstName, String lastName, int streetAddress, String city, String state, int zipCode){
        this.firstName=firstName;
        this.lastName=lastName;
        this.streetAddress=streetAddress;
        this.city=city;
        this.state=state;
        this.zipCode=zipCode;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setStreetAddress(int num){
        streetAddress=num;
    }
    public void setCity(String name){
        city=name;
    }
    public void setState(String name){
        state=name;
    }
    public void setZipCode(int num){
        zipCode=num;
    }
    
    
    
    
    public String toString(){
        return "Name: "+firstName+" "+lastName+"\n"
        +streetAddress+", "+city+", "+state+", "+zipCode+"\n\n";
        
    }
    
}





import java.util.*;
public class MyProgram
{
    
    
    public static void main(String[] args)
    {
        ArrayList<AddressBook> addresses=new ArrayList<AddressBook>();
        Scanner scan=new Scanner(System.in);
        
        
        boolean usingAddressBook=true;
        boolean addingAddress=false;
        boolean modifyingAddress=false;
        boolean findingAddress=false;
        boolean removingAddress=false;
        
        String temp;
        
        String firstName;
        String lastName;
        int streetAddress;
        String city;
        String state;
        int zipCode;
        
        
        
        //divider
        
        while(usingAddressBook){
            try{
            System.out.println("What do you want to do?"
            +"\n1 - adding an address"
            +"\n2 - modifying an address"
            +"\n3 - finding an address"
            +"\n4 - removing an address"
            +"\n5 - show address book"
            +"\n6 - end program");
            int option=scan.nextInt();
            
            if(option==1){
                addingAddress=true;
            }
            if(option==2){
                modifyingAddress=true;
            }
            if(option==3){
                findingAddress=true;
            }
            if(option==4){
                removingAddress=true;
            }
            if(option==5){
                System.out.println("\nAdress book:\n");
                System.out.println(addresses);
            }
            if(option==6){
                usingAddressBook=false;
                System.out.println("goodbye");
            }
            }
            catch (Exception e) {
        System.out.println("\nplease try again\n");
        }
        temp=scan.nextLine();
            
            //divider
            
        while(addingAddress){
            
        try{
            System.out.println("what is your first and last name?");
            firstName=scan.next();
            lastName=scan.next();
            System.out.println("What is your street address?");
            streetAddress=scan.nextInt();
            temp=scan.nextLine();
            System.out.println("What city do you live in?");
            city=scan.nextLine();
            System.out.println("What state do you live in?");
            state=scan.nextLine();
            System.out.println("what is your zipcode");
            zipCode=scan.nextInt();
            temp=scan.nextLine();
            
            AddressBook address=new AddressBook(firstName, lastName, streetAddress, city, state, zipCode);
            addresses.add(address);
            System.out.println(addresses);
            
            System.out.println("\nAre you done adding?(y/n)");
            if (scan.next().equalsIgnoreCase("y")){
                addingAddress=false;
            }
        }
        catch (Exception e) {
        System.out.println("\nplease try again\n");
        }
        
        }
        //divider
        
        while(modifyingAddress){
            try{
                boolean found=false;
                System.out.println("Type the first name of the person whose address you want to change");
                firstName=scan.next();
            for(AddressBook addressToModify:addresses){
                if (addressToModify.getFirstName().equalsIgnoreCase(firstName)){
                    found=true;
                    System.out.println("\nCurrent address to modify:");
                    System.out.println(addressToModify);
                    // buch of setter here
                    System.out.println("What would you like to change the address to?");
                    addressToModify.setStreetAddress(scan.nextInt());
                    temp=scan.nextLine();
                    System.out.println("What would you like to change the city to?");
                    addressToModify.setCity(scan.nextLine());
                    System.out.println("What would you like to change the state to?");
                    addressToModify.setState(scan.nextLine());
                    System.out.println("What would you like to change the zip code to?");
                    addressToModify.setZipCode(scan.nextInt());
                    temp=scan.nextLine();
                }
            }
            if (!found){
                System.out.println("Address does not exist");
            }
            System.out.println("\nAre you done modifying?(y/n)");
            if (scan.next().equalsIgnoreCase("y")){
                modifyingAddress=false;
            }
            }
            catch (Exception e) {
                System.out.println("\nItem not found\n");
            }
            
        }
        //divider
        
        while(findingAddress){
            try{
                boolean found=false;
            System.out.println("Type the first name of the person whose address you want to find");
            firstName=scan.next();
            for(AddressBook addressToFind:addresses){
                if (addressToFind.getFirstName().equalsIgnoreCase(firstName)){
                    found=true;
                    System.out.println(addressToFind);
                }
            }
            if (!found){
                System.out.println("Address does not exist");
            }
            System.out.println("\nAre you done finding an address?(y/n)");
            if (scan.next().equalsIgnoreCase("y")){
                findingAddress=false;
            }
            }
            catch (Exception e) {
                System.out.println("\nItem not found\n");
            }
            
        }
        //divider
        while(removingAddress){
            try{
                boolean found=false;
            System.out.println("Type the first name of the person whose address you want to remove");
            firstName=scan.next();
            temp=scan.nextLine();
            for(int i=addresses.size()-1; i>=0;i--){
                if (addresses.get(i).getFirstName().equalsIgnoreCase(firstName)){
                    found=true;
                    addresses.remove(i);
                    System.out.println("Adress has been removed");
                }
            }
            if (!found){
                System.out.println("Address does not exist");
            }
            System.out.println("\nAre you done removing an address?(y/n)");
            if (scan.next().equalsIgnoreCase("y")){
                removingAddress=false;
            }
            }
            catch (Exception e) {
                System.out.println("\nItem not found\n");
            }
            
        }
        
        
        
        }   //end of usingAddress
    }
}












//space


