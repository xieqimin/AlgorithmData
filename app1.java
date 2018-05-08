 List<String> list=new ArrayList<>();
        int n=0;
        int lineLength;

        while (n<words.length){
            List<String> line=new ArrayList<>();//存防每行单词
            lineLength=0;
            //1.0 进行循环分行（使用贪心算法）
            while (n<words.length&&lineLength+words[n].length()+line.size()<=maxWidth){
                lineLength+=words[n].length();
                line.add(words[n]);
                n++;
            }
            //1.1 新建字符串
            String lineWord="";
            String kge = "";//空格
            //1.2 判断是否为最后一行
            if(!(n==words.length)){  //n==words.length-1 应该是n++后的值
            //1.2.1 false 生成空格数组 或者 利用余数
                //判断line中是否只有一个word 防止除0

                if(line.size()==1){
                    lineWord+=line.get(0);
                    for(int i=0;i<maxWidth-lineLength;i++){
                        kge+=" ";
                    }
                    lineWord+=kge;
                }
                else {
                     //余数
                    int remainder = (maxWidth - lineLength) % (line.size() - 1);
                     //平均空格数
                    int num = (maxWidth - lineLength) / (line.size() - 1);

                    for (int i = 0; i < num; i++) {
                        kge += " ";
                    }
                    for (int i=0;i<line.size()-1;i++){
                        if(i<remainder){
                            lineWord+=line.get(i)+kge+" ";
                        }else {
                            lineWord+=line.get(i)+kge;
                        }
                    }
                    lineWord+=line.get(line.size()-1);
                }
            }
            //1.2.2 true 在每个非第一个单词前插入空格并在最后插满空格
            else {
                for(int i=0;i<line.size();i++){
                    if(i==line.size()-1){
                        //最后一个单词
                        for(int ii=0;ii<maxWidth - lineLength-line.size()+1;ii++){
                            kge+=" ";
                        }
                        lineWord+=line.get(i)+kge;
                    }
                    else {
                        lineWord+=line.get(i)+" ";
                    }
                }
            }
            //1.3 add进数组
            list.add(lineWord);

        }

        //2 return
        return list;
