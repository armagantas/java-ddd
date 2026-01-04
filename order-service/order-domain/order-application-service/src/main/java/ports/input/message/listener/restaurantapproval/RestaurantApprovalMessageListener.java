package ports.input.message.listener.restaurantapproval;

import dto.message.RestaurantApprovalResponse;

public interface RestaurantApprovalMessageListener {
    void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);

    void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse);
}
