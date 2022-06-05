// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class ApiKeyManagedResourceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The API group and version of the managed resource that the API Key associated with, for example, `cmk/v2`.
        /// </summary>
        [Input("apiVersion", required: true)]
        public Input<string> ApiVersion { get; set; } = null!;

        [Input("environment", required: true)]
        public Input<Inputs.ApiKeyManagedResourceEnvironmentArgs> Environment { get; set; } = null!;

        /// <summary>
        /// The ID of the Environment that the managed resource belongs to, for example, `env-abc123`.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// The kind of the managed resource that the API Key associated with, for example, `Cluster`.
        /// </summary>
        [Input("kind", required: true)]
        public Input<string> Kind { get; set; } = null!;

        public ApiKeyManagedResourceArgs()
        {
        }
    }
}
