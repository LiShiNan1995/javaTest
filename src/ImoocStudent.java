public class ImoocStudent {
    private String nickName;

    public ImoocStudent() {
    }

    public ImoocStudent(String nickName) {
        this.nickName = nickName;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class<ImoocStudent> cls1 = ImoocStudent.class;
        ImoocStudent student = new ImoocStudent();
        Class cls2 = student.getClass();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
