package com.bridgelabz.UserValidationTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserTest {
        String emailId;
        public UserTest(String emailId){
            super();
            this.emailId = emailId;
        }
        UserValidationTest user ;
        @Before
       public void initialize(){
            user = new UserValidationTest();
        }
        @Test
    public void firstNameHappyTest(){
            boolean firstName = user.checkFirstName("Prathmesh");
            Assert.assertTrue(firstName);
        }
    @Test
    public void firstNameSadTest(){
        boolean firstName = user.checkFirstName("prathmesh");
        Assert.assertFalse(firstName);
    }
    @Test
    public void checkLastNameHappyTest(){
        boolean lastName = user.checkLastName("Vardam");
        Assert.assertTrue(lastName);
    }
    @Test
    public void checkLastNameSadTest(){
        boolean lastName = user.checkLastName("aardam");
        Assert.assertFalse(lastName);
    }
    @Test
    public void phoneNumberHappyTest(){
        boolean phoneNumber = user.checkMobileNumber("919930516251");
        Assert.assertTrue(phoneNumber);
    }
    @Test
    public void phoneNumberBadTest(){
        boolean phoneNumber = user.checkMobileNumber("12221 9930516251");
        Assert.assertFalse(phoneNumber);
    }
    @Test
    public void passwordHappyTest(){
            boolean password = user.checkPassword("Pr@thmesh123");
            Assert.assertTrue(password);
    }
    @Test
    public void passwordSadTest(){
        boolean password = user.checkPassword("Prthmesh123");
        Assert.assertFalse(password);
    }
    @Test
    public void emailHappyTest(){
            boolean email = user.checkEmail("prathmesh.32@gmai.com");
            Assert.assertTrue(email);
    }
    @Test
    public void emailSadTest(){
        boolean email = user.checkEmail("prathmesh.@gmai.com");
        Assert.assertFalse(email);
    }

    @Parameterized.Parameters
    public static Collection input(){
    return Arrays.asList( new String[] {"prathmesh.32@gmai.com" , "prathmesh123@gmail.com"});
    }
   @Test
    public void checkEmailWithMultipleInputs(){
       Assert.assertEquals(true,user.checkEmail(emailId));
    }

}
