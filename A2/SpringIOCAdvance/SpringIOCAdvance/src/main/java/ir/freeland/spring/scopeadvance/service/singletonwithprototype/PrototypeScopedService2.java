package ir.freeland.spring.scopeadvance.service.singletonwithprototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import ir.freeland.spring.scopeadvance.service.BaseService;

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Service
public class PrototypeScopedService2 implements BaseService {

}
