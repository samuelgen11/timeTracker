package com.perigea.tracker.timesheet.dto;

import com.perigea.tracker.timesheet.enumerator.RuoloType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RuoliDto {
	private RuoloType ruoloType;
	private String descrizioneRuolo;
	
	public RuoliDto() {
	}
}
