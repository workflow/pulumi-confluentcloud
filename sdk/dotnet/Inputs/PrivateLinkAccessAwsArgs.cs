// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ConfluentCloud.Inputs
{

    public sealed class PrivateLinkAccessAwsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The AWS account ID to enable for the Private Link Access. You can find your AWS account ID [here] (https://console.aws.amazon.com/billing/home?#/account) under **My Account** in your AWS Management Console. Must be a **12 character string**.
        /// </summary>
        [Input("account", required: true)]
        public Input<string> Account { get; set; } = null!;

        public PrivateLinkAccessAwsArgs()
        {
        }
        public static new PrivateLinkAccessAwsArgs Empty => new PrivateLinkAccessAwsArgs();
    }
}
