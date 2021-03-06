/* Problem 14 #100ProblemSolvingChallenge
    
   Problem Link: https://www.hackerrank.com/challenges/java-sort/problem
   
   You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.

Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.

Input Format

The first line of input contains an integer N, representing the total number of students. The next N lines contains a list of student information in the following structure:

ID Name CGPA
Constraints
2 <= N <= 1000
0 <= ID <= 100000
5 <= |Name| <= 30
0 <= CGPA <= 4.00

The name contains only lowercase English letters. The ID contains only integer numbers without leading zeros. The CGPA will contain, at most, 2 digits after the decimal point.

Output Format

After rearranging the students according to the above rules, print the first name of each student on a separate line.

Sample Input

5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
Sample Output

Ashis
Fahim
Samara
Samiha
Rumpa
*/
import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

class Checker implements Comparator<Student>{

    @Override 
    public int compare(Student a, Student b){

        if(a.getCgpa() == b.getCgpa()){   /* This problem is almost similar as Java Comparator Hacker Rank problem. 
		                                   but little bit change here. Inside Student class variables are private. That's why we use here getter */
            return a.getFname().compareTo(b.getFname());
        }else if(a.getCgpa() < b.getCgpa()){
            return 1;
        }else{
            return -1;
        }
    }
}

public class JavaSortHackerRank
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
	//	Checker checker = new Checker();
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        Collections.sort(studentList, new Checker()); // And here little bit change. 
		/* Arrays.sort works for arrays which can be of primitive data type also. 
		Collections.sort() works for objects Collections like ArrayList, LinkedList, etc */
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



