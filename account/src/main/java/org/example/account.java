package org.example;

import lombok.*;


@RequiredArgsConstructor // 처음에 final 키워드로 선언한 변수는 무조건 받을거
@AllArgsConstructor // 모든 속성을 받아서 생성자 생성
@Setter
@Getter
@ToString
@EqualsAndHashCode // 메모리 주소가 아니라 값 자체를 각각 비교

public class Account {
    private int account_id; // 계좌번호 PK
    private final String accountNO; // 실제 계좌번호
    private String accountType; // 계좌 여부


    @ToString.Exclude // 특정 컬럼을
    private int balance;

    public int getAccount_id() {
        return account_id;
    }

    public String getAccountNO() {
        return accountNO;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getAccountId() {
        return account_id;
    }

    public void setAccountId(int accountId) {
        this.account_id = accountId;
    }

}
