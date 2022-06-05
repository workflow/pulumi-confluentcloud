// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package confluentcloud

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// You can import a connector by using Environment ID, Kafka cluster ID, and connector's name, in the format `<Environment ID>/<Kafka cluster ID>/<Connector name>`, for example$ export CONFLUENT_CLOUD_API_KEY="<cloud_api_key>" $ export CONFLUENT_CLOUD_API_SECRET="<cloud_api_secret>"
//
// ```sh
//  $ pulumi import confluentcloud:index/connector:Connector my_connector "env-abc123/lkc-abc123/S3_SINKConnector_0"
// ```
type Connector struct {
	pulumi.CustomResourceState

	// The custom connector _nonsensitive_ configuration settings to set:
	ConfigNonsensitive pulumi.StringMapOutput `pulumi:"configNonsensitive"`
	// The custom connector _sensitive_ configuration settings to set:
	ConfigSensitive pulumi.StringMapOutput `pulumi:"configSensitive"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  ConnectorEnvironmentOutput  `pulumi:"environment"`
	KafkaCluster ConnectorKafkaClusterOutput `pulumi:"kafkaCluster"`
}

// NewConnector registers a new resource with the given unique name, arguments, and options.
func NewConnector(ctx *pulumi.Context,
	name string, args *ConnectorArgs, opts ...pulumi.ResourceOption) (*Connector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConfigNonsensitive == nil {
		return nil, errors.New("invalid value for required argument 'ConfigNonsensitive'")
	}
	if args.Environment == nil {
		return nil, errors.New("invalid value for required argument 'Environment'")
	}
	if args.KafkaCluster == nil {
		return nil, errors.New("invalid value for required argument 'KafkaCluster'")
	}
	var resource Connector
	err := ctx.RegisterResource("confluentcloud:index/connector:Connector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnector gets an existing Connector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectorState, opts ...pulumi.ResourceOption) (*Connector, error) {
	var resource Connector
	err := ctx.ReadResource("confluentcloud:index/connector:Connector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connector resources.
type connectorState struct {
	// The custom connector _nonsensitive_ configuration settings to set:
	ConfigNonsensitive map[string]string `pulumi:"configNonsensitive"`
	// The custom connector _sensitive_ configuration settings to set:
	ConfigSensitive map[string]string `pulumi:"configSensitive"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  *ConnectorEnvironment  `pulumi:"environment"`
	KafkaCluster *ConnectorKafkaCluster `pulumi:"kafkaCluster"`
}

type ConnectorState struct {
	// The custom connector _nonsensitive_ configuration settings to set:
	ConfigNonsensitive pulumi.StringMapInput
	// The custom connector _sensitive_ configuration settings to set:
	ConfigSensitive pulumi.StringMapInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  ConnectorEnvironmentPtrInput
	KafkaCluster ConnectorKafkaClusterPtrInput
}

func (ConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorState)(nil)).Elem()
}

type connectorArgs struct {
	// The custom connector _nonsensitive_ configuration settings to set:
	ConfigNonsensitive map[string]string `pulumi:"configNonsensitive"`
	// The custom connector _sensitive_ configuration settings to set:
	ConfigSensitive map[string]string `pulumi:"configSensitive"`
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  ConnectorEnvironment  `pulumi:"environment"`
	KafkaCluster ConnectorKafkaCluster `pulumi:"kafkaCluster"`
}

// The set of arguments for constructing a Connector resource.
type ConnectorArgs struct {
	// The custom connector _nonsensitive_ configuration settings to set:
	ConfigNonsensitive pulumi.StringMapInput
	// The custom connector _sensitive_ configuration settings to set:
	ConfigSensitive pulumi.StringMapInput
	// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
	Environment  ConnectorEnvironmentInput
	KafkaCluster ConnectorKafkaClusterInput
}

func (ConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectorArgs)(nil)).Elem()
}

type ConnectorInput interface {
	pulumi.Input

	ToConnectorOutput() ConnectorOutput
	ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput
}

func (*Connector) ElementType() reflect.Type {
	return reflect.TypeOf((**Connector)(nil)).Elem()
}

func (i *Connector) ToConnectorOutput() ConnectorOutput {
	return i.ToConnectorOutputWithContext(context.Background())
}

func (i *Connector) ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorOutput)
}

// ConnectorArrayInput is an input type that accepts ConnectorArray and ConnectorArrayOutput values.
// You can construct a concrete instance of `ConnectorArrayInput` via:
//
//          ConnectorArray{ ConnectorArgs{...} }
type ConnectorArrayInput interface {
	pulumi.Input

	ToConnectorArrayOutput() ConnectorArrayOutput
	ToConnectorArrayOutputWithContext(context.Context) ConnectorArrayOutput
}

type ConnectorArray []ConnectorInput

func (ConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connector)(nil)).Elem()
}

func (i ConnectorArray) ToConnectorArrayOutput() ConnectorArrayOutput {
	return i.ToConnectorArrayOutputWithContext(context.Background())
}

func (i ConnectorArray) ToConnectorArrayOutputWithContext(ctx context.Context) ConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorArrayOutput)
}

// ConnectorMapInput is an input type that accepts ConnectorMap and ConnectorMapOutput values.
// You can construct a concrete instance of `ConnectorMapInput` via:
//
//          ConnectorMap{ "key": ConnectorArgs{...} }
type ConnectorMapInput interface {
	pulumi.Input

	ToConnectorMapOutput() ConnectorMapOutput
	ToConnectorMapOutputWithContext(context.Context) ConnectorMapOutput
}

type ConnectorMap map[string]ConnectorInput

func (ConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connector)(nil)).Elem()
}

func (i ConnectorMap) ToConnectorMapOutput() ConnectorMapOutput {
	return i.ToConnectorMapOutputWithContext(context.Background())
}

func (i ConnectorMap) ToConnectorMapOutputWithContext(ctx context.Context) ConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectorMapOutput)
}

type ConnectorOutput struct{ *pulumi.OutputState }

func (ConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Connector)(nil)).Elem()
}

func (o ConnectorOutput) ToConnectorOutput() ConnectorOutput {
	return o
}

func (o ConnectorOutput) ToConnectorOutputWithContext(ctx context.Context) ConnectorOutput {
	return o
}

// The custom connector _nonsensitive_ configuration settings to set:
func (o ConnectorOutput) ConfigNonsensitive() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringMapOutput { return v.ConfigNonsensitive }).(pulumi.StringMapOutput)
}

// The custom connector _sensitive_ configuration settings to set:
func (o ConnectorOutput) ConfigSensitive() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Connector) pulumi.StringMapOutput { return v.ConfigSensitive }).(pulumi.StringMapOutput)
}

// Environment objects represent an isolated namespace for your Confluent resources for organizational purposes.
func (o ConnectorOutput) Environment() ConnectorEnvironmentOutput {
	return o.ApplyT(func(v *Connector) ConnectorEnvironmentOutput { return v.Environment }).(ConnectorEnvironmentOutput)
}

func (o ConnectorOutput) KafkaCluster() ConnectorKafkaClusterOutput {
	return o.ApplyT(func(v *Connector) ConnectorKafkaClusterOutput { return v.KafkaCluster }).(ConnectorKafkaClusterOutput)
}

type ConnectorArrayOutput struct{ *pulumi.OutputState }

func (ConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connector)(nil)).Elem()
}

func (o ConnectorArrayOutput) ToConnectorArrayOutput() ConnectorArrayOutput {
	return o
}

func (o ConnectorArrayOutput) ToConnectorArrayOutputWithContext(ctx context.Context) ConnectorArrayOutput {
	return o
}

func (o ConnectorArrayOutput) Index(i pulumi.IntInput) ConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Connector {
		return vs[0].([]*Connector)[vs[1].(int)]
	}).(ConnectorOutput)
}

type ConnectorMapOutput struct{ *pulumi.OutputState }

func (ConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connector)(nil)).Elem()
}

func (o ConnectorMapOutput) ToConnectorMapOutput() ConnectorMapOutput {
	return o
}

func (o ConnectorMapOutput) ToConnectorMapOutputWithContext(ctx context.Context) ConnectorMapOutput {
	return o
}

func (o ConnectorMapOutput) MapIndex(k pulumi.StringInput) ConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Connector {
		return vs[0].(map[string]*Connector)[vs[1].(string)]
	}).(ConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorInput)(nil)).Elem(), &Connector{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorArrayInput)(nil)).Elem(), ConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectorMapInput)(nil)).Elem(), ConnectorMap{})
	pulumi.RegisterOutputType(ConnectorOutput{})
	pulumi.RegisterOutputType(ConnectorArrayOutput{})
	pulumi.RegisterOutputType(ConnectorMapOutput{})
}