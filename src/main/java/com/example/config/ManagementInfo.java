package com.example.config;

import static org.springframework.boot.actuate.autoconfigure.web.server.ManagementPortType.DIFFERENT;
import static org.springframework.boot.actuate.autoconfigure.web.server.ManagementPortType.DISABLED;
import static org.springframework.boot.actuate.autoconfigure.web.server.ManagementPortType.SAME;

import org.springframework.boot.actuate.autoconfigure.web.server.ConditionalOnManagementPort;
import org.springframework.stereotype.Component;

public interface ManagementInfo {

  String getInfo();

  @Component
  @ConditionalOnManagementPort(DIFFERENT)
  class ManagementInfoDifferent implements ManagementInfo {
    public String getInfo() {
      return "Running on different port.";
    }
  }

  @Component
  @ConditionalOnManagementPort(SAME)
  class ManagementInfoSame implements ManagementInfo {
    public String getInfo() {
      return "Running on same port.";
    }
  }

  @Component
  @ConditionalOnManagementPort(DISABLED)
  class ManagementInfoDisabled implements ManagementInfo {
    public String getInfo() {
      return "Not running.";
    }
  }
}
