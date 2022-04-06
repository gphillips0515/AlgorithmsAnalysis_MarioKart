//Grace Phillips
//Group 3 Project




//Imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random; 



public class mariokart {
	


	public static void main(String[] args) {
		
		//ANCIENT ALGORITHMS
		
		//Creating list to store lap values for eventual sum
		List<Number> lapRecord = new ArrayList<>();
		
		//Creating Randomizer
		Random rand = new Random();
		
		//We will always start with no mushroom
		boolean mushroomCount = false;
		
		//Setting lap to start with a time of zero
		int lap = 0;
		
		//User input will either be true/false
		boolean userInput = null != null;
		
		//Scanner being called in
		Scanner input = new Scanner(System.in); 
		
		
		int laps = 1; 
		
		boolean quit = false;
		
		//Probabilities for every item box
		//Random number will be decided and actions will be taken depending on the value it generates.
		int mushroomChance = 45;
		int n = rand.nextInt(100);
		n += 1; 
		
		int n2 = rand.nextInt(100);
		n2 += 1; 
		
		int n3 = rand.nextInt(100);
		n3 += 1; 
		
		int n4 = rand.nextInt(100);
		n4 += 1; 
		
		int n5 = rand.nextInt(100);
		n5 += 1; 
		
		int n6 = rand.nextInt(100);
		n6 += 1; 
	    
		System.out.println("Welcome to the Ancient Algorithms Track!");
		System.out.println("The fastest path to this map will happen if you take shortcuts 1 & 3 every lap.\n");
		System.out.println("This track contains 3 laps and you must have a mushroom available in order to take a shortcut.");
		System.out.println("Let the game begin! 3.....2.....1....GO!!!!!!\n");
		
		
	
		
		do
		{
			
			//WHEN YOU GET A MUSHROOM
			if(n < mushroomChance)
			{
				System.out.println("You hit your first item box!");
				System.out.println("You got a mushroom!");
				mushroomCount = true; 
				lap = lap + 2;
				
				
				//First Shortcut
				System.out.println("You have a mushroom to take the first shortcut! Would you like to take it (true/false)");
				userInput = input.nextBoolean();
				
				
			//WHEN YOU TAKE THE FIRST SHORTCUT
				 if(mushroomCount = true == userInput)
				{
					System.out.println("You took shortcut #1");
					mushroomCount = false;
					lap = lap + 5;
				

				//You then take the shortcut and hit the Fourth item box
					
					System.out.println("You have hit the fourth item box!");
					if(n4 < mushroomChance)
					{
						System.out.println("You got a mushroom!");
						mushroomCount = true;
						lap = lap + 1;
					}
					
					else if (n4 > mushroomChance)
					{
						System.out.println("You did not recieve a mushroom...Let's Continue");
						mushroomCount = false;
						lap = lap + 1; 
					}
					
					//continues to the 5th item box regardless cuz there is no shortcut at this point
					System.out.println("You have hit the fifth item box!");
					if(n4< mushroomChance)
					{
						System.out.println("You already have a mushroom saved! Let's keep going!");
						lap = lap + 6;
					}
					
					else if(n4 > mushroomChance)
					{
						
						if(n5 < mushroomChance)
						{
							System.out.println("You got a mushroom!");
							mushroomCount = true;
							lap = lap + 6;
						
						}
						
						else if (n5 > mushroomChance)
						{
							System.out.println("You did not recieve a mushroom...Let's Continue");
							mushroomCount = false;
							lap = lap + 6; 
						}
					}
					
					
					System.out.println("You have hit the sixth item box!");
					if(n5< mushroomChance || n4 < mushroomChance)
					{
						System.out.println("You already have a mushroom saved! And we have reached the third shortcut! Would you like to take it? true/false");
						userInput = input.nextBoolean();
						
						if(mushroomCount = true == userInput)
						{
							System.out.println("You took shortcut #3");
							mushroomCount = false;
							lap = lap + 2;
							System.out.println("You have reached the finish line end of lap:");
							System.out.println("Time of lap is:" + lap);
						}
						
						else if(mushroomCount = true != userInput)
						{
							System.out.println("You chose not to take the third shortcut");
							lap = lap + 6;
							System.out.println("You have reached the finish line end of lap: " + lap );
							lapRecord.add(lap);
							System.out.println(lapRecord); 
							laps++; quit = true;
							   
						}
					}
					
					else if(n5 > mushroomChance)
					{
						
						if(n6 < mushroomChance)
						{
							System.out.println("You got a mushroom!");
							mushroomCount = true;
							System.out.println("We have reached the third shortcut! Would you like to take it? true/false");
							userInput = input.nextBoolean();
							
							if(mushroomCount = true == userInput)
							{
								System.out.println("You took shortcut #3");
								mushroomCount = false;
								lap = lap + 2;
								System.out.println("You have reached the finish line end of lap: " + lap);
								lapRecord.add(lap);
								System.out.println(lapRecord); laps++; quit = true;
								   
							}
							
							else if(mushroomCount = true != userInput)
							{
								System.out.println("You chose not to take the third shortcut");
								lap = lap + 6;
								System.out.println("You have reached the finish line end of lap: " + lap);
								lapRecord.add(lap);
								System.out.println(lapRecord); laps++; quit = true;
								   
							}
						
						}
						
						else if (n6 > mushroomChance)
						{
							System.out.println("You did not recieve a mushroom...Let's Continue");
							mushroomCount = false;
							lap = lap + 6; 
							System.out.println("You have reached the finish line end of lap" + lap);
							lapRecord.add(lap);
							System.out.println(lapRecord); laps++; quit = true;	
							   
						}
					}
				}
			}
		//WHEN YOU DO NOT GET A MUSHROOM
		 else
	 	{
			System.out.println("You hit your first item box!");
	 		System.out.println("You did not recieve a mushroom and cannot take the first shortcut...Let's Continue");
	 		lap = lap + 8; 
	 		
	 		System.out.println("You have hit the second item box!");
	 		
	 		if(n2 < mushroomChance)
			{
				System.out.println("You got a mushroom! And we have reached the second shortcut! Would you like to take it? (true/false)");
				mushroomCount = true;
				userInput = input.nextBoolean();
				if(mushroomCount = true == userInput)
				{
					System.out.println("You chose to take the second shortcut!");
					lap = lap + 4;
					
					System.out.println("You have hit the sixth item box!");
					if(n6 < mushroomChance)
					{
						System.out.println("You got a mushroom!");
						mushroomCount = true;
						System.out.println("We have reached the third shortcut! Would you like to take it? true/false");
						userInput = input.nextBoolean();
						
						if(mushroomCount = true == userInput)
						{
							System.out.println("You took shortcut #3");
							mushroomCount = false;
							lap = lap + 2;
							System.out.println("You have reached the finish line end of lap: " + lap);
							lapRecord.add(lap);
							System.out.println(lapRecord); laps++; quit = true;
							   
							 
						
						}
						
						else if(mushroomCount = true != userInput)
						{
							System.out.println("You chose not to take the third shortcut");
							lap = lap + 6;
							System.out.println("You have reached the finish line end of lap: " + lap);
							lapRecord.add(lap);
							System.out.println(lapRecord); laps++; quit = true;
							  
							
						}
					
					}
					
					else if (n6 > mushroomChance)
					{
						System.out.println("You did not recieve a mushroom...Let's Continue");
						mushroomCount = false;
						lap = lap + 6; 
						System.out.println("You have reached the finish line end of lap" + lap);
						lapRecord.add(lap);
						System.out.println(lapRecord); laps++; quit = true;	
						   
						
					}
				}
				
				else if(mushroomCount = true != userInput)
				{
					System.out.println("You have reached the third item box!");
					
					if(n < mushroomChance || n2 <mushroomChance)
	
					{
						System.out.println("You already have a mushroom....Let's continue");
				
						System.out.println("You have hit the fourth item box!");
						System.out.println("You already have a mushroom....Let's continue");
						lap = lap + 1;
						
						System.out.println("You have hit the fifth item box!");
						System.out.println("You already have a mushroom....Let's continue");
						lap = lap + 6;
						
						System.out.println("You have hit the sixth item box and have come upon the third shortcut! Would you like to take it? true/false");
						userInput = input.nextBoolean();
						
						if(mushroomCount = true == userInput)
						{
							System.out.println("You took shortcut #3");
							mushroomCount = false;
							lap = lap + 2;
							System.out.println("You have reached the finish line end of lap:");
							System.out.println("Time of lap is:" + lap);
							lapRecord.add(lap);
							System.out.println(lapRecord); laps++; quit = true;
							   
						}
						else if(mushroomCount = true != userInput)
						{
							System.out.println("You decided to skip shortcut #3");
							mushroomCount = true;
							lap = lap + 6;
							System.out.println("You have reached the finish line end of lap:");
							System.out.println("Time of lap is:" + lap);
							lapRecord.add(lap);
							System.out.println(lapRecord); laps++; quit = true;
							   
						}
						
					}
				}	
					else 
					{
						if(n3 < mushroomChance)
						
							System.out.println("You got a mushroom!");
							mushroomCount = true;
							lap = lap + 6;
							
							System.out.println("You have hit the fourth item box!");
							System.out.println("You already have a mushroom....Let's continue");
							lap = lap + 1;
							
							System.out.println("You have hit the fifth item box!");
							System.out.println("You already have a mushroom....Let's continue");
							lap = lap + 6;
							
							System.out.println("You have hit the sixth item box and have come upon the third shortcut! Would you like to take it? true/false");
							userInput = input.nextBoolean();
							
							if(userInput = true)
							{
								System.out.println("You took shortcut #3");
								mushroomCount = false;
								lap = lap + 2;
								System.out.println("You have reached the finish line end of lap:");
								System.out.println("Time of lap is:" + lap);
								lapRecord.add(lap);
								System.out.println(lapRecord); laps++; quit = true;
								   
							}
							else if(userInput = false)
							{
								System.out.println("You decided to skip shortcut #3");
								mushroomCount = true;
								lap = lap + 6;
								System.out.println("You have reached the finish line end of lap:");
								System.out.println("Time of lap is:" + lap);
								lapRecord.add(lap);
								System.out.println(lapRecord); laps++; quit = true;	
								   
							}
							else if(n3 > mushroomChance)
							{
								System.out.println("You did not get a mushroom....Let's continue");
								lap = lap + 6;
								
								System.out.println("You have reached the fourth item box!");
								if(n4 < mushroomChance)
								{
									System.out.println("You got a mushroom!");
									mushroomCount = true;
									lap = lap + 1;
									
									System.out.println("Lets keep going! You have reached the fifth item box");
									System.out.println("You already have a mushroom saved lets keep going!");
									lap = lap + 6;
									
									
									System.out.println("You have hit the sixth item box and have come upon the third shortcut! Would you like to take it? true/false");
									userInput = input.nextBoolean();
									
									if(mushroomCount = true == userInput)
									{
										System.out.println("You took shortcut #3");
										mushroomCount = false;
										lap = lap + 2;
										System.out.println("You have reached the finish line end of lap:");
										System.out.println("Time of lap is:" + lap);
										lapRecord.add(lap);
										System.out.println(lapRecord); laps++; quit = true;
										   
									}
							
									else if(mushroomCount = true != userInput)
									{
										System.out.println("You decided to skip shortcut #3");
										mushroomCount = true;
										lap = lap + 6;
										System.out.println("You have reached the finish line end of lap:");
										System.out.println("Time of lap is:" + lap);
										lapRecord.add(lap);
										System.out.println(lapRecord); laps++; quit = true;	
										   
									}
								}
							}
					}
							
				}
				
			}
			
			 if (n2 > mushroomChance)
			{
				System.out.println("You did not recieve a mushroom...Let's Continue");
				mushroomCount = false;
				lap = lap + 6; 
				
				System.out.println("You have reached the third item box!");
				
				if(n < mushroomChance || n2 <mushroomChance)

				{
					System.out.println("You already have a mushroom....Let's continue");
			
					System.out.println("You have hit the fourth item box!");
					System.out.println("You already have a mushroom....Let's continue");
					lap = lap + 1;
					
					System.out.println("You have hit the fifth item box!");
					System.out.println("You already have a mushroom....Let's continue");
					lap = lap + 6;
					
					System.out.println("You have hit the sixth item box and have come upon the third shortcut! Would you like to take it? true/false");
					userInput = input.nextBoolean();
					
					if(mushroomCount = true == userInput)
					{
						System.out.println("You took shortcut #3");
						mushroomCount = false;
						lap = lap + 2;
						System.out.println("You have reached the finish line end of lap:");
						System.out.println("Time of lap is:" + lap);
						lapRecord.add(lap);
						System.out.println(lapRecord); laps++; quit = true;
						   
					}
					else if(mushroomCount = true != userInput)
					{
						System.out.println("You decided to skip shortcut #3");
						mushroomCount = true;
						lap = lap + 6;
						System.out.println("You have reached the finish line end of lap:");
						System.out.println("Time of lap is:" + lap);
						lapRecord.add(lap);
						System.out.println(lapRecord); laps++; quit = true;	
						   
					}
					
				}
				else 
				{
					if(n3 < mushroomChance)
					
						System.out.println("You got a mushroom!");
						mushroomCount = true;
						lap = lap + 6;
						
						System.out.println("You have hit the fourth item box!");
						System.out.println("You already have a mushroom....Let's continue");
						lap = lap + 1;
						
						System.out.println("You have hit the fifth item box!");
						System.out.println("You already have a mushroom....Let's continue");
						lap = lap + 6;
						
						System.out.println("You have hit the sixth item box and have come upon the third shortcut! Would you like to take it? true/false");
						userInput = input.nextBoolean();
						
						if(userInput = true)
						{
							System.out.println("You took shortcut #3");
							mushroomCount = false;
							lap = lap + 2;
							System.out.println("You have reached the finish line end of lap:");
							System.out.println("Time of lap is:" + lap);
							lapRecord.add(lap);
							System.out.println(lapRecord); laps++; quit = true;
							   
						}
						else if(userInput = false)
						{
							System.out.println("You decided to skip shortcut #3");
							mushroomCount = true;
							lap = lap + 6;
							System.out.println("You have reached the finish line end of lap:");
							System.out.println("Time of lap is:" + lap);
							lapRecord.add(lap);
							System.out.println(lapRecord); laps++; quit = true;
							   
						}
						else if(n3 > mushroomChance)
						{
							System.out.println("You did not get a mushroom....Let's continue");
							lap = lap + 6;
							
							System.out.println("You have reached the fourth item box!");
							if(n4 < mushroomChance)
							{
								System.out.println("You got a mushroom!");
								mushroomCount = true;
								lap = lap + 1;
								
								System.out.println("Lets keep going! You have reached the fifth item box");
								System.out.println("You already have a mushroom saved lets keep going!");
								lap = lap + 6;
								
								
								System.out.println("You have hit the sixth item box and have come upon the third shortcut! Would you like to take it? true/false");
								userInput = input.nextBoolean();
								
								if(mushroomCount = true == userInput)
								{
									System.out.println("You took shortcut #3");
									mushroomCount = false;
									lap = lap + 2;
									System.out.println("You have reached the finish line end of lap:");
									System.out.println("Time of lap is:" + lap);
									lapRecord.add(lap);
									System.out.println(lapRecord); laps++; quit = true;
									
								}
						
								else if(mushroomCount = true != userInput)
								{
									System.out.println("You decided to skip shortcut #3");
									mushroomCount = true;
									lap = lap + 6;
									System.out.println("You have reached the finish line end of lap:");
									System.out.println("Time of lap is:" + lap);
									lapRecord.add(lap);
									System.out.println(lapRecord); laps++; quit = true;	
								 
								}
							}
						}
				}
			}
	 		
	 	
		
		
		
		
			 
			 
			 
			 
			 
			 
			 
			 //WHEN YOU SKIP THE FIRST SHORTCUT
			 
			 		else if(mushroomCount = true != userInput)
			 		{
			 			System.out.println("You did not take the first shortcut and saved your mushroom");
			 			mushroomCount = true;
			 			lap = lap + 8;
			 			
			 			System.out.println("You have hit the second item box!");
			 			if(mushroomCount = true )
			 			{
							System.out.println("You already have a mushroom saved! And we have reached the second shortcut! Would you like to take it? true/false");
							userInput = input.nextBoolean();
							
							if(mushroomCount = true == userInput)
							{
								System.out.println("You took shortcut #2");
								mushroomCount = false;
								lap = lap + 4;
								
								
								System.out.println("You have hit the sixth item box!");
								if(n6< mushroomChance )
								{
									System.out.println("You got a mushroom!");
									mushroomCount = true; 
							
									System.out.println("You have made it to the third shortcut. Would you like to take it? true/false");
									userInput = input.nextBoolean();
									
									if(mushroomCount = true == userInput)
									{
										System.out.println("You took shortcut #3");
										mushroomCount = false;
										lap = lap + 2;
										System.out.println("You have reached the finish line end of lap:");
										System.out.println("Time of lap is:" + lap);
										lapRecord.add(lap);
										System.out.println(lapRecord); laps++; quit = true;	
										   
									}
									else if(mushroomCount = true != userInput)
									{
										System.out.println("You decided to skip shortcut #3");
										mushroomCount = true;
										lap = lap + 6;
										System.out.println("You have reached the finish line end of lap:");
										System.out.println("Time of lap is:" + lap);
										lapRecord.add(lap);
										System.out.println(lapRecord); laps++; quit = true;	
										   
									}
								}
								
								else if (n6 > mushroomChance)
								{
									System.out.println("You did not get a mushroom and cannot take the third shortcut.");
									lap = lap + 6; 
									System.out.println("You have reached the finish line end of lap" + lap);
									lapRecord.add(lap);
									System.out.println(lapRecord); laps++; quit = true;	
									    
									
								}
							}
							
							else if(mushroomCount = true != userInput)
							{
								System.out.println("You chose not to take the second shortcut");
								lap = lap + 6;
								
								System.out.println("You have reached the third item box!");
								
								if(n < mushroomChance || n2 <mushroomChance)
				
								{
									System.out.println("You already have a mushroom....Let's continue");
							
									System.out.println("You have hit the fourth item box!");
									System.out.println("You already have a mushroom....Let's continue");
									lap = lap + 1;
									
									System.out.println("You have hit the fifth item box!");
									System.out.println("You already have a mushroom....Let's continue");
									lap = lap + 6;
									
									System.out.println("You have hit the sixth item box and have come upon the third shortcut! Would you like to take it? true/false");
									userInput = input.nextBoolean();
									
									if(mushroomCount = true == userInput)
									{
										System.out.println("You took shortcut #3");
										mushroomCount = false;
										lap = lap + 2;
										System.out.println("You have reached the finish line end of lap:");
										System.out.println("Time of lap is:" + lap);
										lapRecord.add(lap);
										System.out.println(lapRecord); laps++; quit = true;
									}
									else if(mushroomCount = true != userInput)
									{
										System.out.println("You decided to skip shortcut #3");
										mushroomCount = true;
										lap = lap + 6;
										System.out.println("You have reached the finish line end of lap:");
										System.out.println("Time of lap is:" + lap);
										lapRecord.add(lap);
										System.out.println(lapRecord); laps++; quit = true;	
									}
									
								}
								else 
								{
									if(n3 < mushroomChance)
									
										System.out.println("You got a mushroom!");
										mushroomCount = true;
										lap = lap + 6;
										
										System.out.println("You have hit the fourth item box!");
										System.out.println("You already have a mushroom....Let's continue");
										lap = lap + 1;
										
										System.out.println("You have hit the fifth item box!");
										System.out.println("You already have a mushroom....Let's continue");
										lap = lap + 6;
										
										System.out.println("You have hit the sixth item box and have come upon the third shortcut! Would you like to take it? true/false");
										userInput = input.nextBoolean();
										
										if(userInput = true)
										{
											System.out.println("You took shortcut #3");
											mushroomCount = false;
											lap = lap + 2;
											System.out.println("You have reached the finish line end of lap:");
											System.out.println("Time of lap is:" + lap);
											lapRecord.add(lap);
											System.out.println(lapRecord); laps++; quit = true;
										}
										else if(userInput = false)
										{
											System.out.println("You decided to skip shortcut #3");
											mushroomCount = true;
											lap = lap + 6;
											System.out.println("You have reached the finish line end of lap:");
											System.out.println("Time of lap is:" + lap);
											lapRecord.add(lap);
											System.out.println(lapRecord); laps++; quit = true;	
										}
										else if(n3 > mushroomChance)
										{
											System.out.println("You did not get a mushroom....Let's continue");
											lap = lap + 6;
											
											System.out.println("You have reached the fourth item box!");
											if(n4 < mushroomChance)
											{
												System.out.println("You got a mushroom!");
												mushroomCount = true;
												lap = lap + 1;
												
												System.out.println("Lets keep going! You have reached the fifth item box");
												System.out.println("You already have a mushroom saved lets keep going!");
												lap = lap + 6;
												
												
												System.out.println("You have hit the sixth item box and have come upon the third shortcut! Would you like to take it? true/false");
												userInput = input.nextBoolean();
												
												if(mushroomCount = true == userInput)
												{
													System.out.println("You took shortcut #3");
													mushroomCount = false;
													lap = lap + 2;
													System.out.println("You have reached the finish line end of lap:");
													System.out.println("Time of lap is:" + lap);
													lapRecord.add(lap);
													System.out.println(lapRecord); 
													laps++; quit = true;
												}
										
												else if(mushroomCount = true != userInput)
												{
													System.out.println("You decided to skip shortcut #3");
													mushroomCount = true;
													lap = lap + 6;
													System.out.println("You have reached the finish line end of lap:");
													System.out.println("Time of lap is:" + lap);
													lapRecord.add(lap);
													System.out.println(lapRecord); 
													laps++; quit = true;	
												}
											}
										}
										
											else if(n4 > mushroomChance)
											{
												System.out.println("You did not get a mushroom...Let's continue");
												lap = lap + 6;
												
											}
										
									}
								}
								
								
							}
							
						}
			 		
			 			else if(n2 > mushroomChance)
			 			{
			 				System.out.println("You did not recieve a mushroom and cannot take the second shortcut...Let's Continue");
			 				mushroomCount = false;
			 				lap = lap + 6;
			 			}
			
		} while(laps <= 3);
	}
}
	


	

	


