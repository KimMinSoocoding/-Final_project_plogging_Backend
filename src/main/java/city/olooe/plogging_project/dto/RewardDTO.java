package city.olooe.plogging_project.dto;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import city.olooe.plogging_project.model.RewardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
/**
 * @author : �����
 * 
 * @date : 2023.06.05
 * 
 * @brief : ������ ���� DTO ������, builder ���
 */
public class RewardDTO {

    // @Temporal(TemporalType.TIMESTAMP)
    // private LocalDateTime localDateTime;
    private Long rewardNo; // PK, Reward ��ȣ
    private String type; // ����Ʈ ����(��� or �����ڽ�)
    private double tradePoint; // ����Ʈ ����, ������
    private Date rewardDate; // ����Ʈ ������Ʈ �ð�
    private Long memberNo; // FK, ȸ�� ��ȣ
    private Long dno; // FK, ��� ��ȣ
    private Long pno; // FK, ��ǰ ��ȣ

    public RewardDTO(final RewardEntity entity) {
        this.rewardNo = entity.getRewardNo();
        this.type = entity.getType();
        this.tradePoint = entity.getTradePoint();
        this.rewardDate = entity.getRewardDate();
        this.dno = entity.getDno();
        this.pno = entity.getPno();
    }

    public static RewardEntity toEntity(final RewardDTO dto) {
        return RewardEntity.builder()
                .rewardNo(dto.getRewardNo())
                .type(dto.getType())
                .tradePoint(dto.getTradePoint())
                .rewardDate(dto.getRewardDate())
                .dno(dto.getDno())
                .pno(dto.getPno())
                .build();
    }

}
