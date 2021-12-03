package com.example.locatec;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class RequestItem {
  Long id;
  String createdAt;
  String updatedAt;
  String latitude;
  String longitude;
  String type;
  boolean isRegister;
  String imageUrl;
}
