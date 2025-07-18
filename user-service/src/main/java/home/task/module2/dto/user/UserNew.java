package home.task.module2.dto.user;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

/**
 * DTO запись нового пользователя
 *
 * @param name - имя пользователя
 * @param email - почта пользователя
 * @param age - возраст пользователя
 */
@Schema(description = "Запись нового пользователя")
public record UserNew(
        @NotBlank(message = "Имя не может быть пустым")
        @Size(min = 1, max = 255, message = "Длина имени может быть от 1 до 255 символов")
        @Schema(description = "Имя пользователя", example = "Ivan")
        String name,
        @Email
        @NotBlank(message = "Почта не может быть пустой")
        @Size(min = 6, max = 255, message = "Длина почты может быть от 6 до 255 символов")
        @Schema(description = "Email пользователя", example = "test@mail.com")
        String email,
        @PositiveOrZero(message = "Возраст не может быть отрицательным числом")
        @Schema(description = "Возраст пользователя", example = "18")
        Integer age
) {
}
