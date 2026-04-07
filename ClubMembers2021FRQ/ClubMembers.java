import java.util.ArrayList;

public class ClubMembers 
{
    private ArrayList<MemberInfo> memberList;

    public ClubMembers(ArrayList<MemberInfo> memberList)
    {
        //TODO: Complete the constructor
    }
    
    /**
     * Adds member to the memberList in the correct location to retain
     * ascending order.
     * 
     * @param member the member to be added
     * @return true if the member is successfully added, false otherwise.
     */
    public boolean insertSorted(MemberInfo member)
    {
        //TODO: Complete the method
        return false; //FIX THIS
    }
    
    /**
     * Adds new club members to memberList, ensuring that ascending order
     * is retained in memberList. Be sure you do not rewrite functionality
     * that is already written in other methods.
     * 
     * Precondition: names is a non-empty array.
     */
    public void addMembers(String[] names, int gradYear)
    {
        //TODO: Complete the method
    }

    /**
     * Removes all members who have graduated and returns a list of members who have
     * graduated and are in good standing.
     */
    public ArrayList<MemberInfo> removeMembers(int year)
    {
        //TODO: Complete the method
        return null; //FIX THIS
    }   

    /**
     * Returns the memberList. (used for testing purposes - do not remove)
     * @return
     */
    public ArrayList<MemberInfo> getMemberList()
    {
        return memberList;
    }
}
