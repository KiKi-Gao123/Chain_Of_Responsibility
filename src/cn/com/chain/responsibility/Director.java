package cn.com.chain.responsibility;

public class Director extends BigLeader{
    public Director(String name){
        super(name);
    }
    public void handleRequest(LeaveRequest request){
        if (request.getLeaveDays()<3){
            System.out.println(name+"审批员工"+request.getLeaveName()+"的请假条,请假天数为"+request.getLeaveDays()+"天");
        }else {
            if (this.successor!=null){
                this.successor.handleRequest(request);
            }
        }
    }
}
