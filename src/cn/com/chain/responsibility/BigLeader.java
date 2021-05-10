package cn.com.chain.responsibility;

public abstract class BigLeader {
    protected String name;
    protected BigLeader successor;
    public BigLeader (String name){
        this.name=name;
    }

    public void setSuccessor(BigLeader successor){
        this.successor=successor;
    }
    public abstract void handleRequest(LeaveRequest request);
}
