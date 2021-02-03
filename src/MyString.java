import java.util.Arrays;
public final class MyString implements Comparable<MyString> {
    private final char[] value;
    public MyString(char value[]){
        this.value= Arrays.copyOf(value,value.length);
    }
    public  MyString(char value[],int offset,int count ){
        this.value=Arrays.copyOfRange(value,offset,offset+count);
    }
    public MyString(MyString s){
        this.value= s.value;
    }

    public  boolean equals(Object s){
        if(this==s){
            return true;
        }
        if (s==null){
            return false;
        }
        if (!(s instanceof MyString)){
            return false;
        }
        return Arrays.equals(value,((MyString)s).value);
    }
    public MyString toUpper(){
        MyString a=new MyString(value);
        for (int i=0;i<a.value.length;i++){
            if (a.value[i]<='z'&&a.value[i]>='a'){
                a.value[i]=(char)(a.value[i]+('A'-'a'));
            }
        }
        return a;
    }
    @Override
    public int compareTo(MyString o) {
        return 0;
    }
}
