package binar.box.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class PanelDTO {

	private long id;

	private List<LockSectionDTO> lockSectionDTO;
}
