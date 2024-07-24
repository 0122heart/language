package j22_람다;

@FunctionalInterface
public interface Operation {
    public int calc(int x, int y);

    public default String resultToString(int result){
        return "결과 >>> " + result;
    }
}
