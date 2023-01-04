# goals:
The goal of this assignment is to simulate a simple atm. There will be a checkings account and a savings account with intrest. There will be 1 admin. The admin will be able to add users, delete users, and apply intrest. the users will just be able to view balance deposit or withdraw. 
    
# input:
   The input that will be taken in from the user will be done from an admin user(which will just be extra permissions under a user class that will be implemented by the atm class itself.). it will also be able to take in input from a text file.
# output:
This program will output all of the user data to a text file. The user's info will be stored in a user class and outputted to a text file for later use.
    
# User class: 
The user class will have a pin(string),accountNum(String), CheckingAccount(object),  and Savings(Objet)
    User constructor will set all of those variables except the objects to an inputted value
    getPin()
    setpin()
    getAccountNum
    setAccountNum
    setChecking
    setSaving
    getChecking
    getSavings
    
    
# Checkings class
 The checkings class will have a balance(double)
        the contrusctor will set balance to an inputted value
        getBalance()
        setBalance()
        Deposit():
            deposit will desposit whatever amount inputed into the checking balance
        Withdraw():
            withdraw will take in an amount to withdraw. if that amount is larger than what is in the account, an error will appear instead
#   Savings class 
will inherit checkings but will make a few additions to it. 
      applyIntrest()
            apply intrest will take in a rate and a months variable. it will multiply the balance times (1+rate(times)) and set that to the new balance for the savings account
            
            
# Atm class
The Atm class is where all of these will come together. 
==At this time I do not think the atm class will have a constructor??(final class that will be implemented, will change this if necessary)==
    it will just have a main function. The main will be doing alot in this program. I know there are more efficent ways of doing this. This is how I wrapped my head around it. 
        make an array list of users called users 
        if the output.txt file exists read from it and set the initial array list to the users from the previous time this program was used
         if the output does not exist add an admin and a few testers to the arraylist.
        make a string called input to test the user inputs. 
        add a user to the array list with the account # 00000  and pin 12345
        maybe add a few more tester accounts just to have 
        prompt the user to input the account number. test to see if it exists in the array list. if that account number does not prompt an error screen. 
        prompt the user to input the pin. test to see if that pin matches up with their account number they entered if it did: go on if it didnt prompt an error
        if the user's account number is equal to 00000 then prompt an admin menu that will function like this:
            0)add a user
            1)delete a user (account must be empty)
            2)list all users
            3)apply interest to all savings accounts
            4)exit
                hello admin, select an option
                take in their input if it is somthing different from an int 0-4 then error
                5 if statements for each option
                
 for add a user it will ask them the account number and the pin, and a starting value for each of their account types. if the account number is the same as one in the array list make them pick a new account number
                
for delete a user: the admin must put in the account number. if the checkings and savings both do not equal 0 it will display an error
                
for list all users: print the entire array list
                
for apply interest to all savings accounts it will ask for the rate and the months. it will then use savings.applyIntrest() with the admins inputted values for all users.
                
 exit will take them back.

if the user's account number is not equal to 00000 then prompt the normal user menu:

0) get checking balance
1) deposit checking
2) withdraw checking
3) get savings balance
4) deposit savings
5) withdraw savings
6) exit

there will be 7 if statements based on which option the user choses the else will be an error that they entered incorrectly

get checking balance: will use user.getChecking

deposit checking will use user.CheckingAccount.deposit(()

withdraw checking will use User.CheckingAccount.withdraw()

get savings balance will use user.getSaving

deposit saving will use user.SavingsAccount.deposit()

withdraw savings will use user.Savingsaccount.withdraw()

exit will exit


after the user is done it will log them out 

after this print the arrayList to output.txt
        
            
        
        
        

        