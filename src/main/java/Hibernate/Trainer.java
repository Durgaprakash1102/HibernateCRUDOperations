package Hibernate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainer
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int tid;
    private int salary;
    private int exp;
    private String tname;
    public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
    public int getTid()
    {
		return tid;
	}
    
    public String getTname() 
    {
		return tname;
	}
    public int getSalary()
    {
		return salary;
	}
    public int getExp() 
    {
		return exp;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Trainer [tid=" + tid + ", salary=" + salary + ", exp=" + exp + ", tname=" + tname + "]";
	}
	
    
}