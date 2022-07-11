package com.example.designpattern.composite;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import org.springframework.util.CollectionUtils;

@Data
public class Bag implements Component{

  private List<Component> items;

  public void add(Component item) {
    if (CollectionUtils.isEmpty(items)) {
      items = new ArrayList<>();
      items.add(item);
    } else {
      items.add(item);
    }
  }

  @Override
  public int getPrintPrice() {
    if(CollectionUtils.isEmpty(items)) {
      return 0;
    }
    return items.stream().mapToInt(Component::getPrintPrice).sum();
  }
}
