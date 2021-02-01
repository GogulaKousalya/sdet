package GroovyActivities

class Activity1 {
	
		
			static void main(args) {
				
				def x //In Groovy
				int y //In Java
				
				//Array
				def arr = [1, 2.5, "Krish", true, x, y]
				
				arr.each { println "Value is: " + it +". Data type is: " + it.getClass() }
			}
		}

