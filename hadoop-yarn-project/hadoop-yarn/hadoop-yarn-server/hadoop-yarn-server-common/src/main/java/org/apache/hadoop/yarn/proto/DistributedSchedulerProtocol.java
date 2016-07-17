// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: distributed_scheduler_protocol.proto

package org.apache.hadoop.yarn.proto;

public final class DistributedSchedulerProtocol {
  private DistributedSchedulerProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf service {@code hadoop.yarn.DistributedSchedulerProtocolService}
   */
  public static abstract class DistributedSchedulerProtocolService
      implements com.google.protobuf.Service {
    protected DistributedSchedulerProtocolService() {}

    public interface Interface {
      /**
       * <code>rpc registerApplicationMasterForDistributedScheduling(.hadoop.yarn.RegisterApplicationMasterRequestProto) returns (.hadoop.yarn.DistSchedRegisterResponseProto);</code>
       */
      public abstract void registerApplicationMasterForDistributedScheduling(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.RegisterApplicationMasterRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedRegisterResponseProto> done);

      /**
       * <code>rpc finishApplicationMaster(.hadoop.yarn.FinishApplicationMasterRequestProto) returns (.hadoop.yarn.FinishApplicationMasterResponseProto);</code>
       */
      public abstract void finishApplicationMaster(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterResponseProto> done);

      /**
       * <code>rpc allocateForDistributedScheduling(.hadoop.yarn.DistSchedAllocateRequestProto) returns (.hadoop.yarn.DistSchedAllocateResponseProto);</code>
       */
      public abstract void allocateForDistributedScheduling(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateResponseProto> done);

    }

    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new DistributedSchedulerProtocolService() {
        @java.lang.Override
        public  void registerApplicationMasterForDistributedScheduling(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.yarn.proto.YarnServiceProtos.RegisterApplicationMasterRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedRegisterResponseProto> done) {
          impl.registerApplicationMasterForDistributedScheduling(controller, request, done);
        }

        @java.lang.Override
        public  void finishApplicationMaster(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterResponseProto> done) {
          impl.finishApplicationMaster(controller, request, done);
        }

        @java.lang.Override
        public  void allocateForDistributedScheduling(
            com.google.protobuf.RpcController controller,
            org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateRequestProto request,
            com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateResponseProto> done) {
          impl.allocateForDistributedScheduling(controller, request, done);
        }

      };
    }

    public static com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new com.google.protobuf.BlockingService() {
        public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }

        public final com.google.protobuf.Message callBlockingMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request)
            throws com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.registerApplicationMasterForDistributedScheduling(controller, (org.apache.hadoop.yarn.proto.YarnServiceProtos.RegisterApplicationMasterRequestProto)request);
            case 1:
              return impl.finishApplicationMaster(controller, (org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterRequestProto)request);
            case 2:
              return impl.allocateForDistributedScheduling(controller, (org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateRequestProto)request);
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.yarn.proto.YarnServiceProtos.RegisterApplicationMasterRequestProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterRequestProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateRequestProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedRegisterResponseProto.getDefaultInstance();
            case 1:
              return org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterResponseProto.getDefaultInstance();
            case 2:
              return org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateResponseProto.getDefaultInstance();
            default:
              throw new java.lang.AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc registerApplicationMasterForDistributedScheduling(.hadoop.yarn.RegisterApplicationMasterRequestProto) returns (.hadoop.yarn.DistSchedRegisterResponseProto);</code>
     */
    public abstract void registerApplicationMasterForDistributedScheduling(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.yarn.proto.YarnServiceProtos.RegisterApplicationMasterRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedRegisterResponseProto> done);

    /**
     * <code>rpc finishApplicationMaster(.hadoop.yarn.FinishApplicationMasterRequestProto) returns (.hadoop.yarn.FinishApplicationMasterResponseProto);</code>
     */
    public abstract void finishApplicationMaster(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterResponseProto> done);

    /**
     * <code>rpc allocateForDistributedScheduling(.hadoop.yarn.DistSchedAllocateRequestProto) returns (.hadoop.yarn.DistSchedAllocateResponseProto);</code>
     */
    public abstract void allocateForDistributedScheduling(
        com.google.protobuf.RpcController controller,
        org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateRequestProto request,
        com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateResponseProto> done);

    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return org.apache.hadoop.yarn.proto.DistributedSchedulerProtocol.getDescriptor().getServices().get(0);
    }
    public final com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }

    public final void callMethod(
        com.google.protobuf.Descriptors.MethodDescriptor method,
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Message request,
        com.google.protobuf.RpcCallback<
          com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.registerApplicationMasterForDistributedScheduling(controller, (org.apache.hadoop.yarn.proto.YarnServiceProtos.RegisterApplicationMasterRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedRegisterResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.finishApplicationMaster(controller, (org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterResponseProto>specializeCallback(
              done));
          return;
        case 2:
          this.allocateForDistributedScheduling(controller, (org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateRequestProto)request,
            com.google.protobuf.RpcUtil.<org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateResponseProto>specializeCallback(
              done));
          return;
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getRequestPrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.yarn.proto.YarnServiceProtos.RegisterApplicationMasterRequestProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterRequestProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateRequestProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getResponsePrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedRegisterResponseProto.getDefaultInstance();
        case 1:
          return org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterResponseProto.getDefaultInstance();
        case 2:
          return org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateResponseProto.getDefaultInstance();
        default:
          throw new java.lang.AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends org.apache.hadoop.yarn.proto.DistributedSchedulerProtocol.DistributedSchedulerProtocolService implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.RpcChannel channel;

      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void registerApplicationMasterForDistributedScheduling(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.RegisterApplicationMasterRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedRegisterResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedRegisterResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedRegisterResponseProto.class,
            org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedRegisterResponseProto.getDefaultInstance()));
      }

      public  void finishApplicationMaster(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterResponseProto.class,
            org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterResponseProto.getDefaultInstance()));
      }

      public  void allocateForDistributedScheduling(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateRequestProto request,
          com.google.protobuf.RpcCallback<org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateResponseProto.class,
            org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedRegisterResponseProto registerApplicationMasterForDistributedScheduling(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.RegisterApplicationMasterRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterResponseProto finishApplicationMaster(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterRequestProto request)
          throws com.google.protobuf.ServiceException;

      public org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateResponseProto allocateForDistributedScheduling(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateRequestProto request)
          throws com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.BlockingRpcChannel channel;

      public org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedRegisterResponseProto registerApplicationMasterForDistributedScheduling(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.RegisterApplicationMasterRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedRegisterResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedRegisterResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterResponseProto finishApplicationMaster(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          org.apache.hadoop.yarn.proto.YarnServiceProtos.FinishApplicationMasterResponseProto.getDefaultInstance());
      }


      public org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateResponseProto allocateForDistributedScheduling(
          com.google.protobuf.RpcController controller,
          org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateRequestProto request)
          throws com.google.protobuf.ServiceException {
        return (org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(2),
          controller,
          request,
          org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.DistSchedAllocateResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:hadoop.yarn.DistributedSchedulerProtocolService)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$distributed_scheduler_protocol.proto\022\013" +
      "hadoop.yarn\032\031yarn_service_protos.proto\032\'" +
      "yarn_server_common_service_protos.proto2" +
      "\271\003\n#DistributedSchedulerProtocolService\022" +
      "\224\001\n1registerApplicationMasterForDistribu" +
      "tedScheduling\0222.hadoop.yarn.RegisterAppl" +
      "icationMasterRequestProto\032+.hadoop.yarn." +
      "DistSchedRegisterResponseProto\022~\n\027finish" +
      "ApplicationMaster\0220.hadoop.yarn.FinishAp" +
      "plicationMasterRequestProto\0321.hadoop.yar",
      "n.FinishApplicationMasterResponseProto\022{" +
      "\n allocateForDistributedScheduling\022*.had" +
      "oop.yarn.DistSchedAllocateRequestProto\032+" +
      ".hadoop.yarn.DistSchedAllocateResponsePr" +
      "otoBB\n\034org.apache.hadoop.yarn.protoB\034Dis" +
      "tributedSchedulerProtocol\210\001\001\240\001\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.apache.hadoop.yarn.proto.YarnServiceProtos.getDescriptor(),
          org.apache.hadoop.yarn.proto.YarnServerCommonServiceProtos.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
