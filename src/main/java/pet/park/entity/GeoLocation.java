package pet.park.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Embeddable
@Data
@NoArgsConstructor
public class GeoLocation {
  private BigDecimal latitude;
  private BigDecimal longitude;

  public GeoLocation(GeoLocation geoLocation) {
    this.latitude = geoLocation.latitude;
    this.longitude = geoLocation.longitude;
  }
}
