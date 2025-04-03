package support;

public class NameValidator {
    public static void validate(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("이름은 공백일 수 없습니다.");
        }
        if (name.length() > 5){
            throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
        }
    }
}
