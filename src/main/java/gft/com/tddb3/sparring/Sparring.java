package gft.com.tddb3.sparring;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(onlyExplicitlyIncluded=true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sparring {
	
	@Getter
	private String nome;
	
	@Getter
	private Integer xp;
	
	
	private String[] golpes;
	

	public void recebeGolpe() {
		this.xp -= 3;
	}
}
