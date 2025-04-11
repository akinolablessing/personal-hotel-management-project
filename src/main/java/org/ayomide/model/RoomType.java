package org.ayomide.model;

import lombok.Getter;

@Getter
public enum RoomType {

        DELUXE(
                "Spacious room with a king-size bed and city view",
                new String[]{"Free Wi-Fi", "Flat-screen TV", "Mini fridge", "Air conditioning", "Complimentary breakfast"}
        ),

        EXECUTIVE(
                "Premium room with workspace and lounge access",
                new String[]{"Free Wi-Fi", "Work desk", "Executive lounge access", "Coffee maker", "Premium toiletries"}
        ),

        SUITE(
                "Luxurious suite with separate living area and master bedroom",
                new String[]{"Free Wi-Fi", "Living room", "2 Flat-screen TVs", "Bathtub", "Room service", "Mini bar"}
        ),

        STUDIO_APARTMENT(
                "Fully-furnished studio apartment for extended stays",
                new String[]{"Kitchenette", "Washer/Dryer", "Free Wi-Fi", "Smart TV", "Dining area", "Housekeeping"}
        ),

        CLASSIC(
                "Standard room with basic comfort and style",
                new String[]{"Free Wi-Fi", "TV", "Air conditioning", "Ensuite bathroom", "Wardrobe"}
        );

        private final String feature;
        private final String[] amenities;

        RoomType(String feature, String[] amenities) {
            this.feature = feature;
            this.amenities = amenities;
        }

}
