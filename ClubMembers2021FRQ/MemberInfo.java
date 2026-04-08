public class MemberInfo 
{
    private int gradYear;
    private boolean hasGoodStanding;
    private String name;
    
    /**
     * Constructs a MemberInfo object for the club member * with name name,
     * graduation year gradYear, and
     * standing hasGoodStanding.
     */
    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) 
    {
        //TODO: Complete the constructor
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;

    }

    /**
     * Returns true if the member is in good standing and false
     * otherwise.
     */
    public boolean inGoodStanding() 
    {
        return hasGoodStanding; //FIX THIS
    }

    /*
     * TODO: Create a properly defined equals method that checks
     *       to see if the name and graduation year are the same
     * 
     * TODO: Create accessor methods for name and grad year. 
     *       Be sure your capitalization and spelling are correct!
     * 
    */
   public String getName(){
        return name;

   }
   public int getGradYear(){
        return gradYear;

   }
  
public boolean equals(Object obj){
        if(!(obj instanceof MemberInfo)) return false;
        MemberInfo other = (MemberInfo) obj;
        return other.getName().equals(name) && other.getGradYear() == gradYear;
}


    public String toString()
    {
        return "<" + name + " " + gradYear + " " + hasGoodStanding + ">";
    }
    
}
