package org.skypro.skyshop.basket;

import java.util.List;

public class UserBasket {
    private final List<BasketItem> basketItems;
    private final int total;

    public UserBasket(List<BasketItem> basketItems) {
        this.basketItems = basketItems;
        this.total = basketItems.stream()
                .mapToInt(basketItem -> (int) basketItem.getProduct().getPrice() * basketItem.getNumberOfProducts())
                .sum();;
    }

    public int getTotal() {
        return total;
    }

    public List<BasketItem> getBasketItems() {
        return List.copyOf(basketItems);
    }
}