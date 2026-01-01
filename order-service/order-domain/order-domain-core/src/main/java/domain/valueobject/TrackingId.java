package domain.valueobject;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID id) {
        super(id);
    }
}
