/*
* Generated file
*
* Generated from: yang module name: butler-service-impl yang module local name: butler-service-impl
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Mon Dec 08 18:56:09 EST 2014
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.config.butler_service.impl;
@org.opendaylight.yangtools.yang.binding.annotations.ModuleQName(revision = "2014-11-16", name = "butler-service-impl", namespace = "urn:opendaylight:params:xml:ns:yang:controller:config:butler-service:impl")

public abstract class AbstractButlerServiceModule implements org.opendaylight.controller.config.spi.Module,org.opendaylight.controller.config.yang.config.butler_service.impl.ButlerServiceModuleMXBean,org.opendaylight.controller.config.yang.config.butler_service.impl.ButlerServiceServiceInterface,org.opendaylight.controller.config.api.RuntimeBeanRegistratorAwareModule {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(org.opendaylight.controller.config.yang.config.butler_service.impl.AbstractButlerServiceModule.class);

    //attributes start

    public static final org.opendaylight.controller.config.api.JmxAttribute notificationServiceJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("NotificationService");
    private javax.management.ObjectName notificationService; // mandatory

    public static final org.opendaylight.controller.config.api.JmxAttribute rpcRegistryJmxAttribute = new org.opendaylight.controller.config.api.JmxAttribute("RpcRegistry");
    private javax.management.ObjectName rpcRegistry; // mandatory

    //attributes end

    private final AbstractButlerServiceModule oldModule;
    private final java.lang.AutoCloseable oldInstance;
    private java.lang.AutoCloseable instance;
    protected final org.opendaylight.controller.config.api.DependencyResolver dependencyResolver;
    private final org.opendaylight.controller.config.api.ModuleIdentifier identifier;
    @Override
    public org.opendaylight.controller.config.api.ModuleIdentifier getIdentifier() {
        return identifier;
    }

    public AbstractButlerServiceModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldInstance=null;
        this.oldModule=null;
    }

    public AbstractButlerServiceModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier,org.opendaylight.controller.config.api.DependencyResolver dependencyResolver,AbstractButlerServiceModule oldModule,java.lang.AutoCloseable oldInstance) {
        this.identifier = identifier;
        this.dependencyResolver = dependencyResolver;
        this.oldModule = oldModule;
        this.oldInstance = oldInstance;
    }

    private org.opendaylight.controller.config.yang.config.butler_service.impl.ButlerServiceRuntimeRegistrator rootRuntimeBeanRegistratorWrapper;

    public org.opendaylight.controller.config.yang.config.butler_service.impl.ButlerServiceRuntimeRegistrator getRootRuntimeBeanRegistratorWrapper(){
        return rootRuntimeBeanRegistratorWrapper;
    }

    @Override
    public void setRuntimeBeanRegistrator(org.opendaylight.controller.config.api.runtime.RootRuntimeBeanRegistrator rootRuntimeRegistrator){
        this.rootRuntimeBeanRegistratorWrapper = new org.opendaylight.controller.config.yang.config.butler_service.impl.ButlerServiceRuntimeRegistrator(rootRuntimeRegistrator);
    }

    @Override
    public void validate() {
        dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.md.sal.binding.NotificationProviderServiceServiceInterface.class, notificationService, notificationServiceJmxAttribute);dependencyResolver.validateDependency(org.opendaylight.controller.config.yang.md.sal.binding.RpcProviderRegistryServiceInterface.class, rpcRegistry, rpcRegistryJmxAttribute);
        customValidation();
    }

    protected void customValidation() {
    }

    private org.opendaylight.controller.sal.binding.api.NotificationProviderService notificationServiceDependency;
    protected final org.opendaylight.controller.sal.binding.api.NotificationProviderService getNotificationServiceDependency(){
        return notificationServiceDependency;
    }private org.opendaylight.controller.sal.binding.api.RpcProviderRegistry rpcRegistryDependency;
    protected final org.opendaylight.controller.sal.binding.api.RpcProviderRegistry getRpcRegistryDependency(){
        return rpcRegistryDependency;
    }

    @Override
    public final java.lang.AutoCloseable getInstance() {
        if(instance==null) {
            rpcRegistryDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.sal.binding.api.RpcProviderRegistry.class, rpcRegistry, rpcRegistryJmxAttribute);
            notificationServiceDependency = dependencyResolver.resolveInstance(org.opendaylight.controller.sal.binding.api.NotificationProviderService.class, notificationService, notificationServiceJmxAttribute);
            if(oldInstance!=null && canReuseInstance(oldModule)) {
                instance = reuseInstance(oldInstance);
            } else {
                if(oldInstance!=null) {
                    try {
                        oldInstance.close();
                    } catch(Exception e) {
                        logger.error("An error occurred while closing old instance " + oldInstance, e);
                    }
                }
                instance = createInstance();
                if (instance == null) {
                    throw new IllegalStateException("Error in createInstance - null is not allowed as return value");
                }
            }
        }
        return instance;
    }
    public abstract java.lang.AutoCloseable createInstance();

    public boolean canReuseInstance(AbstractButlerServiceModule oldModule){
        // allow reusing of old instance if no parameters was changed
        return isSame(oldModule);
    }

    public java.lang.AutoCloseable reuseInstance(java.lang.AutoCloseable oldInstance){
        // implement if instance reuse should be supported. Override canReuseInstance to change the criteria.
        return oldInstance;
    }

    public boolean isSame(AbstractButlerServiceModule other) {
        if (other == null) {
            throw new IllegalArgumentException("Parameter 'other' is null");
        }
        if (notificationServiceDependency != other.notificationServiceDependency) { // reference to dependency must be same
            return false;
        }
        if (rpcRegistryDependency != other.rpcRegistryDependency) { // reference to dependency must be same
            return false;
        }

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractButlerServiceModule that = (AbstractButlerServiceModule) o;
        return identifier.equals(that.identifier);
    }

    @Override
    public int hashCode() {
        return identifier.hashCode();
    }

    // getters and setters
    @Override
    public javax.management.ObjectName getNotificationService() {
        return notificationService;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.binding.NotificationProviderServiceServiceInterface.class)
    public void setNotificationService(javax.management.ObjectName notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public javax.management.ObjectName getRpcRegistry() {
        return rpcRegistry;
    }

    @Override
    @org.opendaylight.controller.config.api.annotations.RequireInterface(value = org.opendaylight.controller.config.yang.md.sal.binding.RpcProviderRegistryServiceInterface.class)
    public void setRpcRegistry(javax.management.ObjectName rpcRegistry) {
        this.rpcRegistry = rpcRegistry;
    }

}
