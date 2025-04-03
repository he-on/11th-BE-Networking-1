package support;

public class CountValidator {
    public static void validate(String countInput) {
        // 공백, null 체크
        if (countInput == null || countInput.isBlank()) {
            throw new IllegalArgumentException("시도 횟수는 공백일 수 없습니다.");
        }

        // 정수인지 확인
        if (!countInput.matches("\\d+")) {
            throw new IllegalArgumentException("시도 횟수는 정수여야 합니다.");
        }

        // 자연수인지 확인 (0 이상)
        int count = Integer.parseInt(countInput);
        if (count <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1 이상의 자연수여야 합니다.");
        }
    }
}
