import java.util.ArrayList;

public class ClubMembers 
{
    private ArrayList<MemberInfo> memberList;

    public ClubMembers(ArrayList<MemberInfo> memberList)
    {
        //TODO: Complete the constructor
        this.memberList = memberList;
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
        int x = memberList.size();
        int k=0;
        while(k<x){
            if(memberList.get(k).equals(member)) return false;
            k++;
        }
        int i = 0;
        while(i<x){
            if(memberList.get(i).getName().compareTo(member.getName())>0){
                memberList.add(i,member);
                return true;
            }
            i++;
         }
        memberList.add(x,member);
        return true;

        
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
        for (String name : names)
        {
            insertSorted(new MemberInfo(name, gradYear, true));
        }
    }

    /**
     * Removes all members who have graduated and returns a list of members who have
     * graduated and are in good standing.
     */
    public ArrayList<MemberInfo> removeMembers(int year)
    {
        ArrayList<MemberInfo> graduated = new ArrayList<MemberInfo>();
        int i = 0;
        while (i < memberList.size())
        {
            MemberInfo member = memberList.get(i);
            if (member.getGradYear() <= year)
            {
                if (member.inGoodStanding())
                {
                    graduated.add(member);
                }
                memberList.remove(i);
            }
            else i++;
            
        }
        return graduated;
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
