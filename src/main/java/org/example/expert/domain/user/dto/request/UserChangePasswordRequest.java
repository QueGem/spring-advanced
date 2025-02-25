package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank(message = "현재 비밀번호는 필수값입니다.")
    private String oldPassword;

    @NotBlank(message = "새 비밀번호는 필수값입니다")
    @Size(min = 8, message = "비밀번호는 최소 8자 이상이어야합니다.")
    @Pattern(regexp = ".*\\d.*", message = "비밀번호에는 숫자가 1개 이상 포함되어야 합니다.")
    @Pattern(regexp = ".*[A-Z].*", message = "비밀번호에는 대문자가 1개 이상 포함되어야합니다.")
    private String newPassword;
}
