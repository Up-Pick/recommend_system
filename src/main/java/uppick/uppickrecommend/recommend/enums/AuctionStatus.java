package uppick.uppickrecommend.recommend.enums;

import lombok.Getter;

@Getter
public enum AuctionStatus {

	IN_PROGRESS("입찰 진행 중"), FINISHED("입찰 끝남"), EXPIRED("유찰");

	private final String description;

	AuctionStatus(String description) {

		this.description = description;
	}

}