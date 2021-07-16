
import java.util.*;


class Student implements Comparable<Student>{


    String name = new String();


    double cgpa;


    int id;


    public Student(String name,double cgpa,int id)


    {


        this.name = name;


        this.cgpa = cgpa;


        this.id = id;


    }


    public String getName(){


        return this.name;


    }


    public int compareTo(Student s)


    {


        if(cgpa == s.cgpa)


        {


            if(name.compareTo(s.name) == 0)


            {


                if(id == s.id)


                    return 0;


                else if (id > s.id)


                    return 1;


                else


                    return -1;


            }


            else


                return name.compareTo(s.name);


        }


        else if(cgpa > s.cgpa)


            return -1;


        else


            return 1;


    }


}



class Priorities{


    public ArrayList<Student> getStudents(List<String> events)


    {


        int n = events.size();


        PriorityQueue<Student> pq = new PriorityQueue<Student>();


        for(String i:events)


        {


            String[] s = new String[4];


            s = i.split("\\s");


            if(s.length>1)


            {


                pq.add(new Student(s[1],Double.valueOf(s[2]),Integer.valueOf(s[3])));


            }


            else


            {


                pq.poll();


            }


        }


        while(pq.size()>1)


        {


            System.out.println(pq.poll().name);


        }


        return new ArrayList<Student>(pq);


    }


}


#Sample Input :

12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED


#Sample Output :

Dan
Ashley
Shafaet
Maria
