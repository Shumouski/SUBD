package subd.selectFingers;
import java.util.ArrayList;
import java.util.List;
public class Headers {
    private String headers1;
    private String headers2;
    private String headers3;
    private String headers4;
    private String headers5;
    private String headers6;
    private String headers7;
    private String headers8;

    public Headers(String headers1, String headers2, String headers3, String headers4, String headers5, String headers6, String headers7, String headers8) {
        this.headers1 = headers1;
        this.headers2 = headers2;
        this.headers3 = headers3;
        this.headers4 = headers4;
        this.headers5 = headers5;
        this.headers6 = headers6;
        this.headers7 = headers7;
        this.headers8 = headers8;
    }

    public String getHeaders1() {
        return headers1;
    }

    public String getHeaders2() {
        return headers2;
    }

    public String getHeaders3() {
        return headers3;
    }

    public String getHeaders4() {
        return headers4;
    }

    public String getHeaders5() {
        return headers5;
    }

    public String getHeaders6() {
        return headers6;
    }

    public String getHeaders7() {
        return headers7;
    }

    public String getHeaders8() {
        return headers8;
    }

    private List<Headers> header = new ArrayList<>();

    public List<Headers> getHeader() {
        return header;
    }
}
