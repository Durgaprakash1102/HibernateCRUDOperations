package Hibernate;


public class Main 
{
    public static void main(String args[])
    {
    	TrainerRepo tri=new TrainerRepoImpl();
    	
    	Trainer t=new Trainer();
    	t.setTname("Amit");
    	t.setExp(5);
    	t.setSalary(50000);
    	tri.insertTrainer(t);
    	
    	Trainer t1=new Trainer();
    	t1.setTname("Balu");
    	t1.setExp(5);
    	t1.setSalary(60000);
    	tri.insertTrainer(t1);
    	
    	Trainer t3=new Trainer();
    	t3.setTname("Chandhu");
    	t3.setExp(5);
    	t3.setSalary(50000);
    	tri.insertTrainer(t3);
    	
    	Trainer t4=new Trainer();
    	t4.setTname("Dimple");
    	t4.setExp(5);
    	t4.setSalary(60000);
    	tri.insertTrainer(t4);
    	
    	Trainer t5=new Trainer();
    	t5.setTid(4);
    	t5.setTname("Dimple");
    	t5.setExp(5);
    	t5.setSalary(70000);
    	tri.updateTrainer(t5);
    	

    	Trainer t6=new Trainer();
    	t6.setTid(3);
    	tri.deleteTrainer(t6);
    	
    	tri.selectTrainers();
    	
    	
    }
}