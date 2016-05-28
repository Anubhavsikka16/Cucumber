package com.anubhav.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Tester {
	
	//To see all annotations, press control and press any annotation below, then press forward and 
	//back arrow in package explorer
	
	            @Given ("^I am a \"([a-zA-Z]{1,})\" tester$")
	            public void I_am_a_Manual_tester(String TesterType){
		
		        System.out.println("@Given-------------I_am_a_"+TesterType+"_tester");
		        
	}
	            
	            
		     @When ("^I apply for a \"([a-zA-Z]{1,})\" job$")
		     public void I_apply_for_a_manual_job(String JobType){
			
			System.out.println("@When------------------I_apply_for_a_"+JobType+"_job");
		}
		
		     
		     @Then ("^I got \"([a-zA-Z]{1,})\" paid$")
		     public void  I_got_less_paid(String Salary){
			
			 System.out.println("@Then------------------I_got_"+Salary+"_paid");
			
		}
		     
		     
             @And ("^I am \"([a-zA-Z]{1,})\" satisfied with my salary$")
		     public void  I_am_not_satisfied_with_my_salary(String money){
			
			 System.out.println("@And------------------I_am_not_"+money+"_with_my_salary");	
		
	}
             
             
             @But ("^My parents are \"([a-zA-Z]{1,})\" satisfied$")
             public void  My_parents_are_happy(String Satisfaction){
	
	         System.out.println("@But------------------My_parents_are_"+Satisfaction+"_happy");	

}

}
