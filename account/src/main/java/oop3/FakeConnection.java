package oop3;

public class FakeConnection implements AutoCloseable {
    public FakeConnection() {
        System.out.println("  연결 열림");
    }

    public void query(String sql) {
        System.out.println("  쿼리 실행");
    }

    @Override
    public void close() {
        System.out.println("  연결 닫힘");
    }
}
