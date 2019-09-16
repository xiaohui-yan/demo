// **********************************************//
// demo 客户端脚本
// 
//
// @author huayu
// @date 2019-09-16
// **********************************************//
var vm = new Vue({
    el: '#app',
    mixins: [atyTplMixin],
    data: function () {
        return {
            rs1: []
        }
    },
    methods: {
        /**
         *
         * @param queryInfo
         */
        loadata : function (queryInfo) {
            var _this = this;
            Artery.loadPageData('demo/rs1', queryInfo).then(function (result) {
                _this.rs1 = result;
            }).catch(function (error) {
                console.error(error);
            });
        }
    }
});