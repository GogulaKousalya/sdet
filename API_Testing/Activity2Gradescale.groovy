package GroovyActivities
class Activity2Gradescale {
		static void main(def args) {
			//Initialize marks
			def marks = [50, 100, 65, 90, 30]
			def sum = 0, avg = 0
			def grade = "F"
			
			//Calculate Average
			marks.each { sum+=it }
			avg = sum/marks.size() as Integer
			
			//Get Grade
			switch(avg) {
				case 80..100:
					grade = "A"
					break
				case 60..79:
					grade = "B"
					break
				case 50..69:
					grade = "C"
					break
				case 40..59:
					grade = "D"
					break
				case 0..39:
					grade = "F"
					break
				default:
					println "Invalid value"
			}
			
			//Print results
			println "Maximum marks: " + marks.max()
			println "Minimum marks: " + marks.min()
			println "Average Grade: " + avg
			println "Grade: " + grade
		}
	}

