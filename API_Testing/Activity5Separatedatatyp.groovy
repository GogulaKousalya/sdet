package GroovyActivities

class Activity5Separatedatatyp {

		static void main(args) {
			//The full combined list
			def fullList = [11, 2, 19, 5, "Orange", "Grapes", "Banana"]
			
			//Portion out the Strings
			def strList = fullList.minus([11, 2, 19, 5])
			//Portion out the Integers
			def intList = fullList.minus([ "Orange", "Grapes", "Banana"])
			
			//Sort both lists and print them
			println "Sorted String list: ${strList.sort()}"
			println "Sorted Integer list: ${intList.sort()}"
		}
	}
