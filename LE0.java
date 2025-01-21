 class JUET{
    public String name;
    public int age;
    
    public void setAge(int _age)
    {
        age=_age;
    }
    public void setName(String _name)
    {
        name=_name;
    }
    public int getAge()
    {
        return age;    
    }
    public String getName()
    {
        return name;
    }
    
}


public class Main {
    public static void main(String[] args) {
        
        // int x = Integer.parseInt(args[0]);

        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(x + " x " + i + " = " + (x * i));
        // }
        JUET a=new JUET();
        a.setAge(20);
        a.setName("Krishna");
        int age=a.getAge();
        String name=a.getName();
        
        System.out.println("Name - "+name);
        System.out.println("Age - "+age);
    }
}
